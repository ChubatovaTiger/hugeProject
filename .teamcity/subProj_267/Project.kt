package subProj_267

import subProj_267.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_267")
    name = "subProj 267"

    buildType(subProj_bt_267_5)
    buildType(subProj_bt_267_3)
    buildType(subProj_bt_267_4)
    buildType(subProj_bt_267_1)
    buildType(subProj_bt_267_2)
    buildType(subProj_bt_267_0)
})
