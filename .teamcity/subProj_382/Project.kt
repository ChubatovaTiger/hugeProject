package subProj_382

import subProj_382.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_382")
    name = "subProj 382"

    buildType(subProj_bt_382_4)
    buildType(subProj_bt_382_3)
    buildType(subProj_bt_382_5)
    buildType(subProj_bt_382_0)
    buildType(subProj_bt_382_2)
    buildType(subProj_bt_382_1)
})
