package subProj_1143

import subProj_1143.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1143")
    name = "subProj 1143"

    buildType(subProj_bt_1143_5)
    buildType(subProj_bt_1143_3)
    buildType(subProj_bt_1143_4)
    buildType(subProj_bt_1143_1)
    buildType(subProj_bt_1143_2)
    buildType(subProj_bt_1143_0)
})
