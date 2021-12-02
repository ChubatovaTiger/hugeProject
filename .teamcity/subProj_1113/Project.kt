package subProj_1113

import subProj_1113.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1113")
    name = "subProj 1113"

    buildType(subProj_bt_1113_1)
    buildType(subProj_bt_1113_0)
    buildType(subProj_bt_1113_3)
    buildType(subProj_bt_1113_2)
    buildType(subProj_bt_1113_5)
    buildType(subProj_bt_1113_4)
})
