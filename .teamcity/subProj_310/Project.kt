package subProj_310

import subProj_310.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_310")
    name = "subProj 310"

    buildType(subProj_bt_310_4)
    buildType(subProj_bt_310_5)
    buildType(subProj_bt_310_2)
    buildType(subProj_bt_310_3)
    buildType(subProj_bt_310_0)
    buildType(subProj_bt_310_1)
})
