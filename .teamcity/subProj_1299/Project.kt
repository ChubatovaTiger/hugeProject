package subProj_1299

import subProj_1299.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1299")
    name = "subProj 1299"

    buildType(subProj_bt_1299_4)
    buildType(subProj_bt_1299_3)
    buildType(subProj_bt_1299_2)
    buildType(subProj_bt_1299_1)
    buildType(subProj_bt_1299_5)
    buildType(subProj_bt_1299_0)
})
