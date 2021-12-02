package subProj_299

import subProj_299.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_299")
    name = "subProj 299"

    buildType(subProj_bt_299_0)
    buildType(subProj_bt_299_1)
    buildType(subProj_bt_299_2)
    buildType(subProj_bt_299_3)
    buildType(subProj_bt_299_4)
    buildType(subProj_bt_299_5)
})
