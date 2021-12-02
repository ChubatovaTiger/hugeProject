package subProj_1136

import subProj_1136.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1136")
    name = "subProj 1136"

    buildType(subProj_bt_1136_1)
    buildType(subProj_bt_1136_2)
    buildType(subProj_bt_1136_0)
    buildType(subProj_bt_1136_5)
    buildType(subProj_bt_1136_3)
    buildType(subProj_bt_1136_4)
})
