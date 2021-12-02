package subProj_1214

import subProj_1214.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1214")
    name = "subProj 1214"

    buildType(subProj_bt_1214_5)
    buildType(subProj_bt_1214_4)
    buildType(subProj_bt_1214_3)
    buildType(subProj_bt_1214_2)
    buildType(subProj_bt_1214_1)
    buildType(subProj_bt_1214_0)
})
