package subProj_136

import subProj_136.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_136")
    name = "subProj 136"

    buildType(subProj_bt_136_5)
    buildType(subProj_bt_136_4)
    buildType(subProj_bt_136_3)
    buildType(subProj_bt_136_2)
    buildType(subProj_bt_136_1)
    buildType(subProj_bt_136_0)
})
