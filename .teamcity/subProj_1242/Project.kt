package subProj_1242

import subProj_1242.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1242")
    name = "subProj 1242"

    buildType(subProj_bt_1242_3)
    buildType(subProj_bt_1242_4)
    buildType(subProj_bt_1242_5)
    buildType(subProj_bt_1242_0)
    buildType(subProj_bt_1242_1)
    buildType(subProj_bt_1242_2)
})
