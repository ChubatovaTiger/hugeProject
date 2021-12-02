package subProj_1308

import subProj_1308.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1308")
    name = "subProj 1308"

    buildType(subProj_bt_1308_5)
    buildType(subProj_bt_1308_4)
    buildType(subProj_bt_1308_1)
    buildType(subProj_bt_1308_0)
    buildType(subProj_bt_1308_3)
    buildType(subProj_bt_1308_2)
})
