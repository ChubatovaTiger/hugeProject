package subProj_486

import subProj_486.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_486")
    name = "subProj 486"

    buildType(subProj_bt_486_2)
    buildType(subProj_bt_486_3)
    buildType(subProj_bt_486_4)
    buildType(subProj_bt_486_5)
    buildType(subProj_bt_486_0)
    buildType(subProj_bt_486_1)
})
