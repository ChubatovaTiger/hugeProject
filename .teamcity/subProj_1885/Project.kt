package subProj_1885

import subProj_1885.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1885")
    name = "subProj 1885"

    buildType(subProj_bt_1885_5)
    buildType(subProj_bt_1885_4)
    buildType(subProj_bt_1885_3)
    buildType(subProj_bt_1885_2)
    buildType(subProj_bt_1885_1)
    buildType(subProj_bt_1885_0)
})
