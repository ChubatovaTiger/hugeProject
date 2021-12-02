package subProj_1269

import subProj_1269.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1269")
    name = "subProj 1269"

    buildType(subProj_bt_1269_1)
    buildType(subProj_bt_1269_0)
    buildType(subProj_bt_1269_3)
    buildType(subProj_bt_1269_2)
    buildType(subProj_bt_1269_5)
    buildType(subProj_bt_1269_4)
})
