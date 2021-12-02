package subProj_697

import subProj_697.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_697")
    name = "subProj 697"

    buildType(subProj_bt_697_0)
    buildType(subProj_bt_697_1)
    buildType(subProj_bt_697_2)
    buildType(subProj_bt_697_3)
    buildType(subProj_bt_697_4)
    buildType(subProj_bt_697_5)
})
