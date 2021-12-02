package subProj_1478

import subProj_1478.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1478")
    name = "subProj 1478"

    buildType(subProj_bt_1478_4)
    buildType(subProj_bt_1478_5)
    buildType(subProj_bt_1478_2)
    buildType(subProj_bt_1478_3)
    buildType(subProj_bt_1478_0)
    buildType(subProj_bt_1478_1)
})
