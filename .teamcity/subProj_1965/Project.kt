package subProj_1965

import subProj_1965.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1965")
    name = "subProj 1965"

    buildType(subProj_bt_1965_0)
    buildType(subProj_bt_1965_1)
    buildType(subProj_bt_1965_2)
    buildType(subProj_bt_1965_3)
    buildType(subProj_bt_1965_4)
    buildType(subProj_bt_1965_5)
})
