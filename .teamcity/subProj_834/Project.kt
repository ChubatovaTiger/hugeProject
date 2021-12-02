package subProj_834

import subProj_834.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_834")
    name = "subProj 834"

    buildType(subProj_bt_834_5)
    buildType(subProj_bt_834_3)
    buildType(subProj_bt_834_4)
    buildType(subProj_bt_834_1)
    buildType(subProj_bt_834_2)
    buildType(subProj_bt_834_0)
})
