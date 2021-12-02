package subProj_885

import subProj_885.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_885")
    name = "subProj 885"

    buildType(subProj_bt_885_3)
    buildType(subProj_bt_885_4)
    buildType(subProj_bt_885_5)
    buildType(subProj_bt_885_0)
    buildType(subProj_bt_885_1)
    buildType(subProj_bt_885_2)
})
