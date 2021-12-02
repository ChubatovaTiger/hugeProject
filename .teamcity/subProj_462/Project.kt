package subProj_462

import subProj_462.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_462")
    name = "subProj 462"

    buildType(subProj_bt_462_5)
    buildType(subProj_bt_462_4)
    buildType(subProj_bt_462_3)
    buildType(subProj_bt_462_2)
    buildType(subProj_bt_462_1)
    buildType(subProj_bt_462_0)
})
