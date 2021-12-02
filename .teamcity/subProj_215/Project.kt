package subProj_215

import subProj_215.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_215")
    name = "subProj 215"

    buildType(subProj_bt_215_2)
    buildType(subProj_bt_215_3)
    buildType(subProj_bt_215_4)
    buildType(subProj_bt_215_5)
    buildType(subProj_bt_215_0)
    buildType(subProj_bt_215_1)
})
