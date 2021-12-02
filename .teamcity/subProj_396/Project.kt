package subProj_396

import subProj_396.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_396")
    name = "subProj 396"

    buildType(subProj_bt_396_4)
    buildType(subProj_bt_396_5)
    buildType(subProj_bt_396_2)
    buildType(subProj_bt_396_3)
    buildType(subProj_bt_396_0)
    buildType(subProj_bt_396_1)
})
