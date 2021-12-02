package subProj_365

import subProj_365.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_365")
    name = "subProj 365"

    buildType(subProj_bt_365_3)
    buildType(subProj_bt_365_2)
    buildType(subProj_bt_365_5)
    buildType(subProj_bt_365_4)
    buildType(subProj_bt_365_1)
    buildType(subProj_bt_365_0)
})
