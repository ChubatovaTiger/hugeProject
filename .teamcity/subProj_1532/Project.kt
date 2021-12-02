package subProj_1532

import subProj_1532.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1532")
    name = "subProj 1532"

    buildType(subProj_bt_1532_1)
    buildType(subProj_bt_1532_2)
    buildType(subProj_bt_1532_0)
    buildType(subProj_bt_1532_5)
    buildType(subProj_bt_1532_3)
    buildType(subProj_bt_1532_4)
})
