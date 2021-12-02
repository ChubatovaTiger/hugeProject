package subProj_1203

import subProj_1203.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1203")
    name = "subProj 1203"

    buildType(subProj_bt_1203_5)
    buildType(subProj_bt_1203_4)
    buildType(subProj_bt_1203_3)
    buildType(subProj_bt_1203_2)
    buildType(subProj_bt_1203_1)
    buildType(subProj_bt_1203_0)
})
