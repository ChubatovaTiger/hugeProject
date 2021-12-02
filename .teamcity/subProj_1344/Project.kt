package subProj_1344

import subProj_1344.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1344")
    name = "subProj 1344"

    buildType(subProj_bt_1344_5)
    buildType(subProj_bt_1344_4)
    buildType(subProj_bt_1344_3)
    buildType(subProj_bt_1344_2)
    buildType(subProj_bt_1344_1)
    buildType(subProj_bt_1344_0)
})
