package subProj_74

import subProj_74.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_74")
    name = "subProj 74"

    buildType(subProj_bt_74_0)
    buildType(subProj_bt_74_3)
    buildType(subProj_bt_74_4)
    buildType(subProj_bt_74_1)
    buildType(subProj_bt_74_2)
    buildType(subProj_bt_74_5)
})
