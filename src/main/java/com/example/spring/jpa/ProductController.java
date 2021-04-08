package com.example.spring.jpa;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prod")
public class ProductController
 {
    @Autowired
ProductRepository pr;
@GetMapping
public Iterable<MemberPremium> getProduct()
{

return pr.findAll();


}
/*
@PostMapping
public @ResponseBody MemberPremium create(@RequestBody MemberPremium p)
{
 return pr.save(p);
}

@PutMapping
public MemberPremium update(@RequestBody MemberPremium p)
{
    return pr.save(p);
}


@GetMapping("/{id}")
public MemberPremium getProduct(@PathVariable("id")Long id)
{
    MemberPremium  pp=null;
Optional<MemberPremium> op=pr.findById(id);
if(op.isPresent())
{
    pp=op.get();
}
return pp;
}

@DeleteMapping("/{id}")
public void delete(@PathVariable("id")Long id)
{

  pr.deleteById(id);


}*/

}
