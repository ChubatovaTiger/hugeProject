package subProj_475

import subProj_475.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_475")
    name = "subProj 475"

    buildType(subProj_bt_475_5)
    buildType(subProj_bt_475_4)
    buildType(subProj_bt_475_3)
    buildType(subProj_bt_475_2)
    buildType(subProj_bt_475_1)
    buildType(subProj_bt_475_0)
})
