package subProj_1973

import subProj_1973.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1973")
    name = "subProj 1973"

    buildType(subProj_bt_1973_2)
    buildType(subProj_bt_1973_3)
    buildType(subProj_bt_1973_4)
    buildType(subProj_bt_1973_5)
    buildType(subProj_bt_1973_0)
    buildType(subProj_bt_1973_1)
})
