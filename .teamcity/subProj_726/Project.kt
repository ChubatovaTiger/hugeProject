package subProj_726

import subProj_726.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_726")
    name = "subProj 726"

    buildType(subProj_bt_726_4)
    buildType(subProj_bt_726_3)
    buildType(subProj_bt_726_2)
    buildType(subProj_bt_726_1)
    buildType(subProj_bt_726_5)
    buildType(subProj_bt_726_0)
})
