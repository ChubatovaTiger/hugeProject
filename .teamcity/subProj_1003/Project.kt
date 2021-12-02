package subProj_1003

import subProj_1003.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1003")
    name = "subProj 1003"

    buildType(subProj_bt_1003_2)
    buildType(subProj_bt_1003_3)
    buildType(subProj_bt_1003_0)
    buildType(subProj_bt_1003_1)
    buildType(subProj_bt_1003_4)
    buildType(subProj_bt_1003_5)
})
