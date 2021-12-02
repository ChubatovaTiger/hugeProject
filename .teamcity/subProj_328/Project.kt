package subProj_328

import subProj_328.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_328")
    name = "subProj 328"

    buildType(subProj_bt_328_2)
    buildType(subProj_bt_328_1)
    buildType(subProj_bt_328_0)
    buildType(subProj_bt_328_5)
    buildType(subProj_bt_328_4)
    buildType(subProj_bt_328_3)
})
