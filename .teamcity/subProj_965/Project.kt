package subProj_965

import subProj_965.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_965")
    name = "subProj 965"

    buildType(subProj_bt_965_5)
    buildType(subProj_bt_965_4)
    buildType(subProj_bt_965_1)
    buildType(subProj_bt_965_0)
    buildType(subProj_bt_965_3)
    buildType(subProj_bt_965_2)
})
