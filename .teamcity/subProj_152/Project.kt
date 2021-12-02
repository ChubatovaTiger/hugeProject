package subProj_152

import subProj_152.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_152")
    name = "subProj 152"

    buildType(subProj_bt_152_0)
    buildType(subProj_bt_152_1)
    buildType(subProj_bt_152_2)
    buildType(subProj_bt_152_3)
    buildType(subProj_bt_152_4)
    buildType(subProj_bt_152_5)
})
