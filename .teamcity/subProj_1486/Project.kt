package subProj_1486

import subProj_1486.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1486")
    name = "subProj 1486"

    buildType(subProj_bt_1486_0)
    buildType(subProj_bt_1486_5)
    buildType(subProj_bt_1486_3)
    buildType(subProj_bt_1486_4)
    buildType(subProj_bt_1486_1)
    buildType(subProj_bt_1486_2)
})
