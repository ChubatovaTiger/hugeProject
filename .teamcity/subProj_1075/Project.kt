package subProj_1075

import subProj_1075.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1075")
    name = "subProj 1075"

    buildType(subProj_bt_1075_5)
    buildType(subProj_bt_1075_3)
    buildType(subProj_bt_1075_4)
    buildType(subProj_bt_1075_1)
    buildType(subProj_bt_1075_2)
    buildType(subProj_bt_1075_0)
})
