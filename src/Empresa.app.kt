fun main() {
    var apar1=Aparcamientos()
    println(apar1)

    //variable apar1 con un objeto de tipo Aparcamientos con los datos por defecto y luego lo muestra
    var coche1=Coches()
    println(coche1)

    //variable coche1 un objeto de tipo Coches con los datos por defecto y luego lo muestra
    var gar1=Garaje(Aparcamientos(),Coches())
    println(gar1)

    //variable gar1 un objeto de tipo Garaje con los datos por defecto y luego lo muestra
    var gar2=Garaje(Aparcamientos(),Coches("PEWI123",14f,19f))
    println(gar2)

    //variable gar2 un objeto de tipo Garaje con los datos de aparcamientos por defecto y unos específicos en Coches

}
