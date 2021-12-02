package subProj_402

import subProj_402.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_402")
    name = "subProj 402"

    buildType(subProj_bt_402_0)
    buildType(subProj_bt_402_1)
    buildType(subProj_bt_402_2)
    buildType(subProj_bt_402_3)
    buildType(subProj_bt_402_4)
    buildType(subProj_bt_402_5)
})
