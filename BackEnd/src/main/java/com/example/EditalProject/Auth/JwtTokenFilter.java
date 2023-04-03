package com.example.EditalProject.Auth;

public class JwtTokenFilter extends OncePerRequestFilter{
	private final UserDetailsService userDetailsService;
    private final JwtConfig jwtConfig;

    public JwtTokenFilter(UserDetailsService userDetailsService, JwtConfig jwtConfig) {
        this.userDetailsService = userDetailsService;
        this.jwtConfig = jwtConfig;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException
}
