package subProj_865

import subProj_865.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_865")
    name = "subProj 865"

    buildType(subProj_bt_865_5)
    buildType(subProj_bt_865_0)
    buildType(subProj_bt_865_4)
    buildType(subProj_bt_865_3)
    buildType(subProj_bt_865_2)
    buildType(subProj_bt_865_1)
})
