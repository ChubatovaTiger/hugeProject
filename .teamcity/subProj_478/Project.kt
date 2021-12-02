package subProj_478

import subProj_478.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_478")
    name = "subProj 478"

    buildType(subProj_bt_478_2)
    buildType(subProj_bt_478_1)
    buildType(subProj_bt_478_0)
    buildType(subProj_bt_478_5)
    buildType(subProj_bt_478_4)
    buildType(subProj_bt_478_3)
})
