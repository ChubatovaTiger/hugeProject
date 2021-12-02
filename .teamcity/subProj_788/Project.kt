package subProj_788

import subProj_788.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_788")
    name = "subProj 788"

    buildType(subProj_bt_788_5)
    buildType(subProj_bt_788_3)
    buildType(subProj_bt_788_4)
    buildType(subProj_bt_788_1)
    buildType(subProj_bt_788_2)
    buildType(subProj_bt_788_0)
})
