package subProj_975

import subProj_975.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_975")
    name = "subProj 975"

    buildType(subProj_bt_975_5)
    buildType(subProj_bt_975_0)
    buildType(subProj_bt_975_3)
    buildType(subProj_bt_975_4)
    buildType(subProj_bt_975_1)
    buildType(subProj_bt_975_2)
})
