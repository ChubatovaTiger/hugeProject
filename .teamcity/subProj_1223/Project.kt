package subProj_1223

import subProj_1223.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1223")
    name = "subProj 1223"

    buildType(subProj_bt_1223_0)
    buildType(subProj_bt_1223_1)
    buildType(subProj_bt_1223_2)
    buildType(subProj_bt_1223_3)
    buildType(subProj_bt_1223_4)
    buildType(subProj_bt_1223_5)
})
