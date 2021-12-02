package subProj_1359

import subProj_1359.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1359")
    name = "subProj 1359"

    buildType(subProj_bt_1359_5)
    buildType(subProj_bt_1359_4)
    buildType(subProj_bt_1359_3)
    buildType(subProj_bt_1359_2)
    buildType(subProj_bt_1359_1)
    buildType(subProj_bt_1359_0)
})
