package subProj_155

import subProj_155.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_155")
    name = "subProj 155"

    buildType(subProj_bt_155_0)
    buildType(subProj_bt_155_1)
    buildType(subProj_bt_155_2)
    buildType(subProj_bt_155_3)
    buildType(subProj_bt_155_4)
    buildType(subProj_bt_155_5)
})
