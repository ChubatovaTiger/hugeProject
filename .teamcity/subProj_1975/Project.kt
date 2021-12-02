package subProj_1975

import subProj_1975.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1975")
    name = "subProj 1975"

    buildType(subProj_bt_1975_0)
    buildType(subProj_bt_1975_1)
    buildType(subProj_bt_1975_2)
    buildType(subProj_bt_1975_3)
    buildType(subProj_bt_1975_4)
    buildType(subProj_bt_1975_5)
})
