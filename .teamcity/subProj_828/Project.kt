package subProj_828

import subProj_828.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_828")
    name = "subProj 828"

    buildType(subProj_bt_828_1)
    buildType(subProj_bt_828_0)
    buildType(subProj_bt_828_3)
    buildType(subProj_bt_828_2)
    buildType(subProj_bt_828_5)
    buildType(subProj_bt_828_4)
})
