package subProj_774

import subProj_774.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_774")
    name = "subProj 774"

    buildType(subProj_bt_774_5)
    buildType(subProj_bt_774_4)
    buildType(subProj_bt_774_1)
    buildType(subProj_bt_774_0)
    buildType(subProj_bt_774_3)
    buildType(subProj_bt_774_2)
})
