package subProj_1317

import subProj_1317.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1317")
    name = "subProj 1317"

    buildType(subProj_bt_1317_3)
    buildType(subProj_bt_1317_2)
    buildType(subProj_bt_1317_5)
    buildType(subProj_bt_1317_4)
    buildType(subProj_bt_1317_1)
    buildType(subProj_bt_1317_0)
})
