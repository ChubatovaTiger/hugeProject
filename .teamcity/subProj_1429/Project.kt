package subProj_1429

import subProj_1429.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1429")
    name = "subProj 1429"

    buildType(subProj_bt_1429_4)
    buildType(subProj_bt_1429_5)
    buildType(subProj_bt_1429_0)
    buildType(subProj_bt_1429_1)
    buildType(subProj_bt_1429_2)
    buildType(subProj_bt_1429_3)
})
