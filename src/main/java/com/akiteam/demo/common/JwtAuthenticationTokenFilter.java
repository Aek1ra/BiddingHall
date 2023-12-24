//package com.akiteam.demo.common;
//
//import com.akiteam.demo.pojo.LoginUser;
//import com.akiteam.demo.redis.RedisCache;
//import com.akiteam.demo.util.JwtUtil;
//import io.jsonwebtoken.Claims;
//import jakarta.servlet.FilterChain;
//
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.stereotype.Component;
//import org.springframework.util.StringUtils;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import javax.servlet.Filter;
//import javax.servlet.FilterConfig;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import java.io.IOException;
//import java.util.Objects;
//
//@Component
//public class JwtAuthenticationTokenFilter extends OncePerRequestFilter {
//
//    @Autowired
//    private RedisCache redisCache;
//
//    @Override
//    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws IOException, ServletException {
//        //获取token
//        String token = request.getHeader("token");
//        if (!StringUtils.hasText(token)) {
//            //放行
//            filterChain.doFilter(request, response);
//            return;
//        }
//        //解析token
//        String userid;
//        try {
//            Claims claims = JwtUtil.parseJWT(token);
//            userid = claims.getSubject();
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new RuntimeException("token非法");
//        }
//        //从redis中获取用户信息
//        String redisKey = "login:" + userid;
//        LoginUser loginUser = redisCache.getCacheObject(redisKey);
//        if(Objects.isNull(loginUser)){
//            throw new RuntimeException("用户未登录");
//        }
//        //存入SecurityContextHolder
//        //TODO 获取权限信息封装到Authentication中
//        UsernamePasswordAuthenticationToken authenticationToken =
//                new UsernamePasswordAuthenticationToken(loginUser,null,null);
//        SecurityContextHolder.getContext().setAuthentication(authenticationToken);
//        //放行
//        filterChain.doFilter(request, response);
//    }
//}