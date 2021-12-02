package subProj_1803

import subProj_1803.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1803")
    name = "subProj 1803"

    buildType(subProj_bt_1803_3)
    buildType(subProj_bt_1803_2)
    buildType(subProj_bt_1803_1)
    buildType(subProj_bt_1803_0)
    buildType(subProj_bt_1803_5)
    buildType(subProj_bt_1803_4)
})
